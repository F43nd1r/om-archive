
solution {
    puzzle = "P009"
    name = "INSTRUCTIONS NO TRACK 10"
    arm(ARM2) {
        number = 1
        position = -2 to 0
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 3
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
