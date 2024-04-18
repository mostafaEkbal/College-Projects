let adjanceyList = new Map();

adjanceyList.set(1, [2, 3]);
adjanceyList.set(2, [4]);
adjanceyList.set(3, [5, 6, 7, 8]);
adjanceyList.set(4, [9, 10]);
adjanceyList.set(5, [11, 12, 13]);
adjanceyList.set(6, [14, 15, 16, 17]);
adjanceyList.set(7, [18, 19, 20]);
adjanceyList.set(8, [21, 22]);

function bfs(graph, start, target) {
  const queue = [start];
  const visited = new Set();
  let path = [];
  let targetFound = false;
  while (queue.length > 0 && !targetFound) {
    bfsSearching(queue);
  }

  function bfsSearching(queue) {
    console.log('nodes \n', queue);
    for (const i in queue) {
      if (!path.length) {
        path.push([queue[i]]);
        break;
      }
      if (!visited.has(queue[i])) {
        path.push([...path[0], queue[i]]);
        visited.add(queue[i]);
      }
      if (queue.length - 1 <= i) {
        path.shift();
      }
    }
    console.log('paths \n', path, '\n');
    const parent = queue.shift();
    if (parent === target) {
      console.log('found', target);
      targetFound = true;
      return;
    }
    if (parent <= graph.size) {
      const childrens = graph.get(parent);
      queue.push(...childrens);
    }
  }
}

function DFS(graph, startNode, goalNode) {
  // Create a stack to store the nodes to be visited.
  const stack = [startNode];

  // Create a visited set to keep track of the nodes that have already been visited.
  const visited = new Set();

  // Create a paths object to store the paths to each node.
  const paths = {[startNode]: [startNode]};
  printStackAndPaths(stack, paths);

  // While the stack is not empty, keep searching.
  while (stack.length > 0) {
    // Get the next node from the stack.
    const node = stack.pop();

    // If we have reached the goal node, return the path to it.
    if (node === goalNode) {
      return console.log('goal node found!', node);
    }

    // Mark the node as visited.
    visited.add(node);

    if (!graph[node - 1]) {
      stack.pop();
      continue;
    }
    // Add the node's children to the stack, in reverse order, if they have not already been visited.
    for (const child of graph[node - 1].reverse()) {
      if (!visited.has(child)) {
        stack.push(child);
        paths[child] = [...paths[node], child];
      }
    }

    // Print the stack and the paths only for the nodes currently in the stack.
    printStackAndPaths(stack, paths);
  }

  // If we reach this point, the goal node was not found.
  return null;
}

function printStackAndPaths(stack, paths) {
  console.log('Stack:');
  for (const node of stack) {
    console.log(`  ${node}`);
  }
  console.log(stack)
  console.log(Object.values(paths))

  console.log('Paths:');
  for (const node of stack) {
    console.log(`  ${node}: ${paths[node]}`);
  }
}

// Create the graph.
const graph = [
  [2, 3],
[4],
[5, 6, 7, 8],
[9, 10],
[11, 12, 13],
[14, 15, 16, 17],
[18, 19, 20],
[21, 22]
];

// Start the DFS search at node 1 and search for node 31.
const startNode = 1;
const goalNode = 13;

// Perform the DFS search.
// dfs(graph, startNode, goalNode);
function dfs(graph, start, target) {
  const queue = [start];
  const visited = new Set();
  let path = [];
  let targetFound = false;
  while (queue.length > 0 && !targetFound) {
    dfsSearching(queue);
  }

  function dfsSearching(queue) {
    console.log('nodes \n', queue);
    for (const i in queue) {
      if (!path.length) {
        path.unshift([queue[i]]);
        break;
      }
      if (!visited.has(queue[i])) {
        path.unshift([...path[0], queue[i]]);
        visited.add(queue[i]);
      }
      if (queue.length - 1 <= i) {
        path.pop();
      }
    }
    console.log('paths \n', path, '\n');
    const parent = queue.shift();
    if (parent === target) {
      console.log('found', target);
      targetFound = true;
      return;
    }
    if (parent <= graph.size) {
      const childrens = graph.get(parent);
      queue.unshift(...childrens);
    }
  }
}

DFS(graph, 1, 13);