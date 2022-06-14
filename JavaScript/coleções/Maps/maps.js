function getAdmins(userMap) {
  let adminPerson = []
  for (const user of userMap) {
    if (user[1] === "Admin") {
      adminPerson.push(user[0])
    }
  }
  return adminPerson.join(", ")
}

let userMap = new Map()
userMap.set("Vitor", "Admin");
userMap.set("Carlos", "User")
userMap.set("Marta", "User")
userMap.set("Santos", "Admin")
userMap.set("Helen", "Admin")
userMap.set("Heeron", "User")

let admins = getAdmins(userMap)
console.log(`The current SysAdmins are ${admins}`);
