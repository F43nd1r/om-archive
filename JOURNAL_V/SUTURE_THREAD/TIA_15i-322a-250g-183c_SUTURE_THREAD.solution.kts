
solution {
    puzzle = "P085"
    name = "B TI15A 1-6T"
    arm(ARM6) {
        number = 1
        position = 0 to -2
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 1 to -2
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to 1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 2 to -1
        rotation = -5
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 1 to -1
        rotation = -2
        size = 3
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = -2
    }
    glyph(BONDER) {
        position = 7 to -9
        rotation = -1
    }
    glyph(BONDER) {
        position = 9 to -11
        rotation = -1
    }
    glyph(BONDER) {
        position = 11 to -13
        rotation = -1
    }
    glyph(BONDER) {
        position = 3 to -5
        rotation = -1
    }
    glyph(BONDER) {
        position = 5 to -7
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 8 to -8
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 10 to -10
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 12 to -12
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 4 to -4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 6 to -6
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 4 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(176)
                grab()
                rotateCounterClockwise()
            }
        }
        )
    }
}
