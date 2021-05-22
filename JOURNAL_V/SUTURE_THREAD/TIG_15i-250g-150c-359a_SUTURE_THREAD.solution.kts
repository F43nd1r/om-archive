
solution {
    puzzle = "P085"
    name = "NEW SOLUTION 1"
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
        position = 4 to -6
        rotation = -1
    }
    glyph(BONDER) {
        position = 6 to -8
        rotation = -1
    }
    glyph(BONDER) {
        position = 8 to -10
        rotation = -1
    }
    glyph(BONDER) {
        position = 10 to -12
        rotation = -1
    }
    glyph(BONDER) {
        position = 12 to -14
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 5 to -5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 7 to -7
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 9 to -9
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 11 to -11
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 13 to -13
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 5 to -3
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
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(144)
                grab()
                rotateCounterClockwise()
            }
        }
        )
    }
}
