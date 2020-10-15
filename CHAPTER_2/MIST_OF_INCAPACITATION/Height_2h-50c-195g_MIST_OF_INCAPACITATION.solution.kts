
solution {
    puzzle = "P018"
    name = "H2"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = -2 to -1
        rotation = -5
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -6 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -8 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -9 to 0
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = -3
    }
    glyph(PROJECTION) {
        position = -3 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -5 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -7 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -8 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 0
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, -1 to 1, -1 to 0)
    }
    track {
        position = -10 to -1
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 1 to 1, 0 to 1, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                back()
                back()
                back()
                drop()
                back()
                back()
                back()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                back()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                reset()
                wait(1)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                reset()
            }
        }
        )
    }
}
