
solution {
    puzzle = "P039"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = -1 to 0
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 1 to 2
        rotation = -1
        size = 1
    }
    arm(ARM2) {
        number = 3
        position = -1 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 2 to 0
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = -4
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -3
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = -4
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 15 to -14
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 13 to -15
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 13 to -12
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 11 to -13
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 11 to -10
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 9 to -11
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 9 to -8
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 7 to -9
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 7 to -6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to -7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 6 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(24)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(26)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(238)
                grab()
                rotateCounterClockwise()
            }
        }
        )
    }
}
