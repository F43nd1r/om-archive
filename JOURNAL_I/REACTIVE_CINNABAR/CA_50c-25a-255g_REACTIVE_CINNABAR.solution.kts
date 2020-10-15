
solution {
    puzzle = "P056"
    name = "B CA"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -2 to -2
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -3 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 0 to -1
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -1 to -3
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 0 to -5
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 3 to -5
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -4
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 0 to -2
        rotation = -2
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -3
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -4
        rotation = 0
    }
    track {
        position = 2 to -1
        positions = listOf(-3 to 1, -2 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(4)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                wait(1)
                pivotClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                extend()
                extend()
                drop()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                forward()
                drop()
                wait(2)
                back()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
            }
        }
        )
    }
}
