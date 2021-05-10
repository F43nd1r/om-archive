
solution {
    puzzle = "P028"
    name = "INSTRUCTIONS NO TRACK 14"
    arm(ARM6) {
        number = 1
        position = -4 to 1
        rotation = 4
        size = 1
    }
    arm(ARM2) {
        number = 2
        position = 2 to 0
        rotation = 6
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = 0 to 3
        rotation = 6
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 4
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -3 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 5
    }
    io(INPUT) {
        index = 1
        position = -5 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to 3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(1)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
