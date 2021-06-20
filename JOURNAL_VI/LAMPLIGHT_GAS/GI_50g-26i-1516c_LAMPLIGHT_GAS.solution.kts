
solution {
    puzzle = "P092"
    name = "GI"
    arm(ARM1) {
        number = 1
        position = 5 to 3
        rotation = -3
        size = 1
    }
    glyph(CALCIFICATION) {
        position = 6 to 2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 4 to 4
        rotation = 12
    }
    io(OUTPUT) {
        index = 0
        position = 7 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 4 to 2
        rotation = 1
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                pivotClockwise()
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
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
