import csv, os
# change your parent dir accordingly
parent_dir = "E:/GitHub/1) Git_Tutorials_Repo_Projects/core-python/Core_Python/ExCsvFiles"

def read_employees(csv_file_location):
    csv.register_dialect('empDialect', skipinitialspace=True, strict=True)
    employee_file = csv.DictReader(open(csv_file_location), dialect='empDialect')
    employee_list = []
    for data in employee_file:
        employee_list.append(data)
    return employee_list

def process_data(employee_list):
    department_list = []
    for employee_data in employee_list:
        department_list.append(employee_data['Department'])
    department_data = {}
    for department_name in set(department_list):
        department_data[department_name] = department_list.count(department_name)
    return department_data

def write_report(dictionary, report_file):
    with open(report_file, "w+") as f:
        for k in sorted(dictionary):
            f.write(str(k) + ':' + str(dictionary[k]) + '\n')

employee_list = read_employees(os.path.join(parent_dir,'Employees.csv'))
dictionary = process_data(employee_list)
write_report(dictionary, os.path.join(parent_dir,'Report.txt'))
print("Report Generated Suuccesfully")