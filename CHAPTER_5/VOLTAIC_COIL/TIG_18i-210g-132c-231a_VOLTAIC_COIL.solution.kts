
solution {
    puzzle = "P039"
    name = "INSTRUCTIONS NO TRACK 9"
    arm(ARM3) {
        number = 1
        position = 0 to 3
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -2 to 5
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = -1 to -1
        rotation = -2
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -6 to 4
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 0 to -2
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = -3 to 5
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 2
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = 0 to -5
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = -3 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 1 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to 6
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                extend()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
