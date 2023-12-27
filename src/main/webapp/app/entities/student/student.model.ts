import dayjs from 'dayjs/esm';
import { IUser } from 'app/entities/user/user.model';
import { IGroupe } from 'app/entities/groupe/groupe.model';

export interface IStudent {
  id: number;
  cNE?: string | null;
  cIN?: string | null;
  dateNaissance?: dayjs.Dayjs | null;
  user?: Pick<IUser, 'id' | 'login'> | null;
  groupe?: Pick<IGroupe, 'id' | 'code'> | null;
}

export type NewStudent = Omit<IStudent, 'id'> & { id: null };
