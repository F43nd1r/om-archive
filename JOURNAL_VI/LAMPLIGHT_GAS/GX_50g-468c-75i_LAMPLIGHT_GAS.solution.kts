
solution {
    puzzle = "P092"
    name = "B GX"
    arm(ARM1) {
        number = 1
        position = 5 to 3
        rotation = 0
        size = 1
    }
    glyph(CALCIFICATION) {
        position = 6 to 2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 5 to 4
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = 7 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
