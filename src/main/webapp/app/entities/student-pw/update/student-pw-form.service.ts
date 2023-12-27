import { Injectable } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

import { IStudentPW, NewStudentPW } from '../student-pw.model';

/**
 * A partial Type with required key is used as form input.
 */
type PartialWithRequiredKeyOf<T extends { id: unknown }> = Partial<Omit<T, 'id'>> & { id: T['id'] };

/**
 * Type for createFormGroup and resetForm argument.
 * It accepts IStudentPW for edit and NewStudentPWFormGroupInput for create.
 */
type StudentPWFormGroupInput = IStudentPW | PartialWithRequiredKeyOf<NewStudentPW>;

type StudentPWFormDefaults = Pick<NewStudentPW, 'id'>;

type StudentPWFormGroupContent = {
  id: FormControl<IStudentPW['id'] | NewStudentPW['id']>;
  imageFront: FormControl<IStudentPW['imageFront']>;
  imageFrontContentType: FormControl<IStudentPW['imageFrontContentType']>;
  imageSide: FormControl<IStudentPW['imageSide']>;
  imageSideContentType: FormControl<IStudentPW['imageSideContentType']>;
  date: FormControl<IStudentPW['date']>;
  angleInterneG: FormControl<IStudentPW['angleInterneG']>;
  angleInterneD: FormControl<IStudentPW['angleInterneD']>;
  angleExterneG: FormControl<IStudentPW['angleExterneG']>;
  angleExterneD: FormControl<IStudentPW['angleExterneD']>;
  angledepouilleG: FormControl<IStudentPW['angledepouilleG']>;
  angledepouilleD: FormControl<IStudentPW['angledepouilleD']>;
  angleConvergence: FormControl<IStudentPW['angleConvergence']>;
  student: FormControl<IStudentPW['student']>;
  pw: FormControl<IStudentPW['pw']>;
};

export type StudentPWFormGroup = FormGroup<StudentPWFormGroupContent>;

@Injectable({ providedIn: 'root' })
export class StudentPWFormService {
  createStudentPWFormGroup(studentPW: StudentPWFormGroupInput = { id: null }): StudentPWFormGroup {
    const studentPWRawValue = {
      ...this.getFormDefaults(),
      ...studentPW,
    };
    return new FormGroup<StudentPWFormGroupContent>({
      id: new FormControl(
        { value: studentPWRawValue.id, disabled: true },
        {
          nonNullable: true,
          validators: [Validators.required],
        },
      ),
      imageFront: new FormControl(studentPWRawValue.imageFront),
      imageFrontContentType: new FormControl(studentPWRawValue.imageFrontContentType),
      imageSide: new FormControl(studentPWRawValue.imageSide),
      imageSideContentType: new FormControl(studentPWRawValue.imageSideContentType),
      date: new FormControl(studentPWRawValue.date),
      angleInterneG: new FormControl(studentPWRawValue.angleInterneG),
      angleInterneD: new FormControl(studentPWRawValue.angleInterneD),
      angleExterneG: new FormControl(studentPWRawValue.angleExterneG),
      angleExterneD: new FormControl(studentPWRawValue.angleExterneD),
      angledepouilleG: new FormControl(studentPWRawValue.angledepouilleG),
      angledepouilleD: new FormControl(studentPWRawValue.angledepouilleD),
      angleConvergence: new FormControl(studentPWRawValue.angleConvergence),
      student: new FormControl(studentPWRawValue.student, {
        validators: [Validators.required],
      }),
      pw: new FormControl(studentPWRawValue.pw, {
        validators: [Validators.required],
      }),
    });
  }

  getStudentPW(form: StudentPWFormGroup): IStudentPW | NewStudentPW {
    return form.getRawValue() as IStudentPW | NewStudentPW;
  }

  resetForm(form: StudentPWFormGroup, studentPW: StudentPWFormGroupInput): void {
    const studentPWRawValue = { ...this.getFormDefaults(), ...studentPW };
    form.reset(
      {
        ...studentPWRawValue,
        id: { value: studentPWRawValue.id, disabled: true },
      } as any /* cast to workaround https://github.com/angular/angular/issues/46458 */,
    );
  }

  private getFormDefaults(): StudentPWFormDefaults {
    return {
      id: null,
    };
  }
}
