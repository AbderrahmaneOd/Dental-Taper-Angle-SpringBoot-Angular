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
  angleInterne1?: number | null;
  angleInterne2?: number | null;
  angleExterne1?: number | null;
  angleExterne2?: number | null;
  angledepouille1?: number | null;
  angledepouille2?: number | null;
  angleConvergence?: number | null;
  student?: Pick<IStudent, 'id'> | null;
  pw?: Pick<IPW, 'id' | 'title'> | null;
}

export type NewStudentPW = Omit<IStudentPW, 'id'> & { id: null };
