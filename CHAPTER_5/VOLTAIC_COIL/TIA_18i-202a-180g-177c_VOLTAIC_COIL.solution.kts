
solution {
    puzzle = "P039"
    name = "INSTRUCTIONS NO TRACK 8"
    arm(ARM6) {
        number = 1
        position = 4 to -1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 1 to 1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 0 to 2
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -2 to -2
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -4 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -17 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 4 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(5)
                grab()
                wait(1)
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                pivotClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
