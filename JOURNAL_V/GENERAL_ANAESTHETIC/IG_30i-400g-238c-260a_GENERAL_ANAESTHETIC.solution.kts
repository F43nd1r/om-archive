
solution {
    puzzle = "P086"
    name = "NEW SOLUTION 1"
    arm(ARM6) {
        number = 1
        position = 12 to -5
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 15 to -7
        rotation = 3
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 12 to -7
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 4
        position = 7 to -2
        rotation = 0
        size = 2
    }
    arm(ARM3) {
        number = 5
        position = 0 to 4
        rotation = 0
        size = 2
    }
    arm(ARM3) {
        number = 6
        position = 4 to -4
        rotation = -2
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = -3 to 1
        rotation = 0
        size = 3
    }
    arm(ARM3) {
        number = 8
        position = -4 to 2
        rotation = -1
        size = 3
    }
    arm(ARM3) {
        number = 9
        position = -4 to -4
        rotation = -1
        size = 3
    }
    glyph(BONDER) {
        position = 2 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to -5
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -7
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 10 to -5
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 4 to 1
        rotation = -1
    }
    glyph(ANIMISMUS) {
        position = 14 to -6
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = 12 to -6
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -8
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = 15 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 9 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(4)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(20)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(38)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(12)
                grab()
                pivotCounterClockwise()
                retract()
                drop()
                extend()
            }
        }
        , 
        {
            sequence(8) {
                wait(9)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(11)
                grab()
                rotateClockwise()
                drop()
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
        )
    }
}
