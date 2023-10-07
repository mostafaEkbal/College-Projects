let adjanceyList = new Map();

adjanceyList.set(1, [2, 3, 4]);
adjanceyList.set(2, [5, 6, 7, 8]);
adjanceyList.set(3, [9, 10]);
adjanceyList.set(4, [11, 12, 13]);
adjanceyList.set(5, [14]);
adjanceyList.set(6, [15, 16, 17]);
adjanceyList.set(7, [18, 19, 20, 21]);
adjanceyList.set(8, [22, 23, 24]);
adjanceyList.set(9, [25]);
adjanceyList.set(10, [26]);
adjanceyList.set(11, [27, 28]);
adjanceyList.set(12, [29, 30]);
adjanceyList.set(13, [31, 32]);

console.log(adjanceyList);

function bfs(start) {
  const queue = [start];
  while (queue.length > 0) {
    bfsSearching(queue);
  }

  function bfsSearching(queue) {
    console.log(queue);
    const parent = queue.shift();
    if (parent <= adjanceyList.size) {
      const childrens = adjanceyList.get(parent);
      queue.push(...childrens);
    }
  }
}

bfs(1);
