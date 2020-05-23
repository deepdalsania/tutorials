import sys, os, re

def error_search(log_file):
    error = input("What is the error? ")
    returned_errors = []
    with open(log_file, mode='r', encoding='UTF-8') as file:
        for log in file.readlines():
            error_patterns = ["error"]
            for i in range(len(error.split(' '))):
                error_patterns.append(r"{}".format(error.split(' ')[i].lower()))
            if all(re.search(error_pattern, log.lower()) for error_pattern in error_patterns):
                returned_errors.append(log)
            file.close()
        return returned_errors

def file_output(returned_errors):
    with open(os.path.join(parent_dir,"FinalAssessmentErrorsFound.log"), 'w') as file:
        for error in returned_errors:
            file.write(error)
        file.close()

if __name__ == "__main__":
  parent_dir = "E:/160350116002/Workspaces/Git_Tutorials_Repo_Projects/core-python/Core_Python/ExDataAndProcessFiles"
  log_file = sys.argv[1]
  returned_errors = error_search(os.path.join(parent_dir,log_file))
  file_output(returned_errors)
  print("Error found and stored in FinalAssessmentErrorsFound.log file")
  sys.exit(0)