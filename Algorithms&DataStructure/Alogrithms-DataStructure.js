import fetch from 'node-fetch';
import { JSDOM } from 'jsdom';

const requestPage = async () => {
  const res = await fetch(
    'https://www.yallakora.com/match-center/%d9%85%d8%b1%d9%83%d8%b2-%d8%a7%d9%84%d9%85%d8%a8%d8%a7%d8%b1%d9%8a%d8%a7%d8%aa#nav-menu'
  );
  const data = await res.text();
  const { document } = new JSDOM(data).window;
  const heading = document.querySelector('.date');

  console.log(heading.textContent);
};

requestPage();
