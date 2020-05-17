''' We have two pieces of furniture: a brown wood table and a red leather
    couch. Fill in the blanks following the creation of each Furniture
    class instance, so that the describe_furniture function can format a
    sentence that describes these pieces as follows: "This piece of
    furniture is made of {color} {material}" '''

class Furniture:
	color = ""
	material = ""

table = Furniture()
table.color = "brown"
table.material = "wood"

couch = Furniture()
couch.color = "red"
couch.material = "leather"

def describe_furniture(piece):
	return ("This piece of furniture is made of {} {}".format(piece.color, piece.material))

print(describe_furniture(table))
# Should be "This piece of furniture is made of brown wood"
print(describe_furniture(couch))
# Should be "This piece of furniture is made of red leather"