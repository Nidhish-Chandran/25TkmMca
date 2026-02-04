import re
password = input("Enter password: ")
errors = []
if not re.match(r'^[A-Z]', password):
    errors.append("Password must begin with a capital letter [A-Z].")
if len(password) < 6 or len(password) > 16:
    errors.append("Password length must be between 6 and 16 characters.")
if not re.search(r"[a-z]", password):
    errors.append("Password must contain at least one lowercase letter [a-z].")
if not re.search(r"[A-Z]", password):
    errors.append("Password must contain at least one uppercase letter [A-Z].")
if not re.search(r"[0-9]", password):
    errors.append("Password must contain at least one digit [0-9].")
if not re.search(r"[$#@]", password):
    errors.append("Password must contain at least one special character ($, #, @).")
if errors:
    print("Password is INVALID due to the following reasons:")
    for e in errors:
        print("-", e)
else:
    print("Password is VALID!")
