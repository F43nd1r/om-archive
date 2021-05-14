
solution {
    puzzle = "P037"
    name = "B TI17"
    arm(ARM6) {
        number = 1
        position = -6 to 5
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -4 to 4
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -5 to 6
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -3 to 3
        rotation = 8
        size = 2
    }
    glyph(BONDER) {
        position = -7 to 6
        rotation = -2
    }
    glyph(BONDER) {
        position = -8 to 9
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -4 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -6 to 6
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
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
