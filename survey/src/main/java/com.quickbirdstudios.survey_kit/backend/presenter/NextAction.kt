package com.quickbirdstudios.survey_kit.backend.presenter

import com.quickbirdstudios.survey_kit.FinishReason
import com.quickbirdstudios.survey_kit.result.StepResult

sealed class NextAction {
    data class Next(val result: StepResult) : NextAction()
    data class Back(val result: StepResult) : NextAction()
    object Skip : NextAction()
    data class Close(val result: StepResult, val finishReason: FinishReason) : NextAction()
}
