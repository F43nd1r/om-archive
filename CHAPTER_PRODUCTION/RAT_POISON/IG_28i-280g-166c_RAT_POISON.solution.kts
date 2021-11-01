
solution {
    puzzle = "P074"
    name = "28I"
    arm(ARM6) {
        number = 1
        position = 0 to 1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 1
        rotation = 0
        size = 2
    }
    arm(ARM3) {
        number = 3
        position = -3 to 2
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 4
        position = -2 to 0
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 5 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -2 to -1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = -1 to -2
        rotation = -6
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 0 to 2
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -1 to 2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -2 to 1
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 7 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = -9
    }
    track {
        position = 5 to -2
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = -4 to 1
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -4 to 0
        positions = listOf(2 to -2, 1 to -1, 1 to 0, 2 to -1)
    }
    conduit {
        id = 100
        position = -4 to 3
        rotation = -1
        positions = listOf(0 to 0, 0 to 1)
    }
    conduit {
        id = 100
        position = 4 to -1
        rotation = -7
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(6)
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(1) {
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
            sequence(7) {
                wait(4)
                grab()
                pivotClockwise()
                pivotClockwise()
                retract()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
