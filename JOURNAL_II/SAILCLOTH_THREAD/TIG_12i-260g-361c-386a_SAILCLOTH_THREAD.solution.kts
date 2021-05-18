
solution {
    puzzle = "P061"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = -15 to 1
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -16 to 1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -12 to -6
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = -14 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = -15 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -14 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = -13 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = -13 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = -8 to -5
        rotation = -3
    }
    glyph(BONDER) {
        position = -10 to -4
        rotation = -4
    }
    glyph(UNBONDER) {
        position = -11 to -4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -9 to -6
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -10 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -10 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -6 to -8
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = -15 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -14 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -11 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -10 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to -9
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -8 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -15 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                extend()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        )
    }
}
