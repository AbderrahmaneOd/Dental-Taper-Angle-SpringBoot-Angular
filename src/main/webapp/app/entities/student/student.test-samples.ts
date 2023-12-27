import dayjs from 'dayjs/esm';

import { IStudent, NewStudent } from './student.model';

export const sampleWithRequiredData: IStudent = {
  id: 985,
  cNE: 'rapide rédaction',
  cIN: 'pacifique longtemps toc',
  dateNaissance: dayjs('2023-12-23'),
};

export const sampleWithPartialData: IStudent = {
  id: 7884,
  cNE: 'pin-pon ferme hôte',
  cIN: 'du fait que',
  dateNaissance: dayjs('2023-12-22'),
};

export const sampleWithFullData: IStudent = {
  id: 30594,
  cNE: 'trop',
  cIN: 'rectangulaire',
  dateNaissance: dayjs('2023-12-23'),
};

export const sampleWithNewData: NewStudent = {
  cNE: 'pendant que à condition que premièrement',
  cIN: "à l'exception de rectorat initier",
  dateNaissance: dayjs('2023-12-22'),
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
