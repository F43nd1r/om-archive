
solution {
    puzzle = "P039"
    name = "B TI14 1-6T"
    arm(ARM6) {
        number = 1
        position = 2 to -1
        rotation = -5
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 4 to -5
        rotation = -3
        size = 1
    }
    arm(ARM2) {
        number = 3
        position = 4 to -3
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 3 to 1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -6
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = -5
    }
    glyph(BONDER) {
        position = 3 to -4
        rotation = -4
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = -6
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = -4
    }
    glyph(CALCIFICATION) {
        position = -2 to 7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 9
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 11
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 13
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 15
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 9
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 11
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 13
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -3
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 2 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 3 to -1
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
                wait(237)
                grab()
                rotateClockwise()
            }
        }
        )
    }
}
