
solution {
    puzzle = "P013"
    name = "NO-TRACK I-6"
    arm(ARM6) {
        number = 1
        position = -2 to 1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to 0
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = -15
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(10)
                grab()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
