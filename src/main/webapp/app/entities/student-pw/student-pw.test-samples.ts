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
  angleExterneG: 25041.81,
  angleExterneD: 28624.01,
  angledepouilleG: 22099.67,
};

export const sampleWithFullData: IStudentPW = {
  id: 7462,
  imageFront: '../fake-data/blob/hipster.png',
  imageFrontContentType: 'unknown',
  imageSide: '../fake-data/blob/hipster.png',
  imageSideContentType: 'unknown',
  date: dayjs('2023-12-22'),
  angleInterneG: 13105.65,
  angleInterneD: 22658.42,
  angleExterneG: 20826.35,
  angleExterneD: 30303.16,
  angledepouilleG: 8705.03,
  angledepouilleD: 3280.11,
  angleConvergence: 1925.93,
};

export const sampleWithNewData: NewStudentPW = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
