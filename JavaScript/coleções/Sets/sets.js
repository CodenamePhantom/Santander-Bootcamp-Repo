function returnSet(arr) {
  let resultArr = []
  let newSet = new Set(arr)
  newSet.forEach(item => resultArr.push(item))
  console.log(`The result array is [${resultArr}]`);
}

const initArr = [30, 30, 40, 5, 223, 2049, 3034, 5]

returnSet(initArr)
