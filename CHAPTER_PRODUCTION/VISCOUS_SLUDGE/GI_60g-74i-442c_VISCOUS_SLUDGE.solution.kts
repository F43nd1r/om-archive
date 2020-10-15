
solution {
    puzzle = "P080"
    name = "B GI"
    arm(ARM1) {
        number = 1
        position = -1 to 3
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to 2
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -3 to 4
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 4
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = -3
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
