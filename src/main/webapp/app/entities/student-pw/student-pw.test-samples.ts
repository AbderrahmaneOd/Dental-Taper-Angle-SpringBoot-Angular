import dayjs from 'dayjs/esm';

import { IStudentPW, NewStudentPW } from './student-pw.model';

export const sampleWithRequiredData: IStudentPW = {
  id: 27910,
};

export const sampleWithPartialData: IStudentPW = {
  id: 25538,
  imageFront: '../fake-data/blob/hipster.png',
  imageFrontContentType: 'unknown',
  imageSide: '../fake-data/blob/hipster.png',
  imageSideContentType: 'unknown',
  date: dayjs('2023-12-23'),
  angleExterne1: 25041.81,
  angleExterne2: 28624.01,
  angledepouille1: 22099.67,
};

export const sampleWithFullData: IStudentPW = {
  id: 7462,
  imageFront: '../fake-data/blob/hipster.png',
  imageFrontContentType: 'unknown',
  imageSide: '../fake-data/blob/hipster.png',
  imageSideContentType: 'unknown',
  date: dayjs('2023-12-22'),
  angleInterne1: 13105.65,
  angleInterne2: 22658.42,
  angleExterne1: 20826.35,
  angleExterne2: 30303.16,
  angledepouille1: 8705.03,
  angledepouille2: 3280.11,
  angleConvergence: 1925.93,
};

export const sampleWithNewData: NewStudentPW = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
