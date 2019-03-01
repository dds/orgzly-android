package com.orgzly.android.usecase

import android.net.Uri
import com.orgzly.android.data.DataRepository

class SavedSearchImport(val uri: Uri) : UseCase() {
    override fun run(dataRepository: DataRepository): UseCaseResult {
        dataRepository.importSavedSearches(uri)

        return UseCaseResult(
                modifiesListWidget = true
        )
    }
}