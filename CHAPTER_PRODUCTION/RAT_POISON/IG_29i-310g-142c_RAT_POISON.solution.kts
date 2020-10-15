
solution {
    puzzle = "P074"
    name = "B II 1-4T"
    arm(ARM6) {
        number = 1
        position = -1 to 2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to 1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -3 to -1
        rotation = 1
        size = 3
    }
    arm(ARM3) {
        number = 4
        position = -3 to 1
        rotation = 2
        size = 1
    }
    arm(ARM3) {
        number = 5
        position = -2 to 0
        rotation = 5
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 8 to -2
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = 7 to -1
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 6 to -1
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = 7 to -2
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -1 to 3
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 0 to 1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -1 to 1
        rotation = -2
    }
    glyph(DISPOSAL) {
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 3
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -2
        rotation = -6
    }
    track {
        position = 1 to 0
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = -4 to 0
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 1 to -1)
    }
    conduit {
        id = 100
        position = -3 to 2
        rotation = 0
    }
    conduit {
        id = 100
        position = 7 to -3
        rotation = -1
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
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                retract()
                extend()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
