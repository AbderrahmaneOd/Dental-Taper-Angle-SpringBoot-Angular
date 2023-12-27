import dayjs from 'dayjs/esm';
import { IStudent } from 'app/entities/student/student.model';
import { IPW } from 'app/entities/pw/pw.model';

export interface IStudentPW {
  id: number;
  imageFront?: string | null;
  imageFrontContentType?: string | null;
  imageSide?: string | null;
  imageSideContentType?: string | null;
  date?: dayjs.Dayjs | null;
  angleInterneG?: number | null;
  angleInterneD?: number | null;
  angleExterneG?: number | null;
  angleExterneD?: number | null;
  angledepouilleG?: number | null;
  angledepouilleD?: number | null;
  angleConvergence?: number | null;
  student?: Pick<IStudent, 'id'> | null;
  pw?: Pick<IPW, 'id' | 'title'> | null;
}

export type NewStudentPW = Omit<IStudentPW, 'id'> & { id: null };
