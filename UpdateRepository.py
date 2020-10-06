
import os
items = __file__.split("\\")
repo_path = items[:len(items) - 1]
repo_path = "\\".join(repo_path)
print("\nupdating repo to github...\n")
os.system("cd {}".format(repo_path))
os.system("git add .")
os.system("git commit -m \"files transported via command-line.\"")
os.system("git push -f origin master")
print("\nrepo updated successfully.\n")