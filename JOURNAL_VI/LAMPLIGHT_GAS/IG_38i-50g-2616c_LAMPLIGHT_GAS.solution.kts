
solution {
    puzzle = "P092"
    name = "B GI 1-11T"
    arm(ARM1) {
        number = 1
        position = 5 to 3
        rotation = 4
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
        position = 4 to 2
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 7 to 3
        rotation = -1
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                drop()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
