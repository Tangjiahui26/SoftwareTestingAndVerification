from subprocess import call, PIPE, Popen, check_output
import time, os, sys
import glob
import shutil

monkeyclickcount = 1000

WORKSPACE = os.path.abspath(".")

def getWorkConfig():
    f = open("./.config", "r")
    config = {"monkeyclickcount": monkeyclickcount}
    try:
        while True:
            line = f.readline()
            if line:
                line = line.strip()
                linesplit = line.split("：")
                if linesplit.__sizeof__() > 1:
                    if linesplit[0] == 'phone':
                        config['phone'] = linesplit[1]
                    elif linesplit[0] == 'monkeyclickcount':
                        config["monkeyclickcount"] = linesplit[1]
            else:
                break
    finally:
        f.close()
        print("config : %s" % config)
        return config

def killTestApp():
    call(['adb', '-s', workConfig.get('phone'), 'shell', 'am', 'force-stop', 'com.esoxjem.movieguide'])

def fullmonkey(workconfig):
    killTestApp()
    options = "-p com.esoxjem.movieguide " \
              "-s 500 --ignore-crashes --ignore-timeouts --monitor-native-crashes " \
              "-v -v -v"
    monkey_output = 'monkey_log.txt'
    with open(monkey_output, 'wb') as f:
        call(['adb', '-s', workconfig.get("phone"), 'shell', 'monkey', options, workconfig.get("monkeyclickcount")], stdout=f, stderr=f)


workConfig = getWorkConfig()

print("execute monkey")
fullmonkey(workConfig)

print("create bugreport file")

bugreport = 'bugreport.txt'
with open(bugreport, 'wb') as f:
    call(['adb', 'bugreport'], stdout=f, stderr=f)

print("create bugreport file, done")

zip_file = glob.glob('./bugreport*.zip')

call(['java', '-jar', 'chkbugreport-0.4-185.jar', zip_file[0]])

for file in zip_file:
    os.remove(file)

print("Completion of the current round of testing")
input("Enter key to close")