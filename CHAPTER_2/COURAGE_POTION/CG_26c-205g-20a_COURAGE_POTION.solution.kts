
solution {
    puzzle = "P021"
    name = "B CA 2T"
    arm(ARM1) {
        number = 1
        position = -4 to 2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -4 to 0
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to -2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 0 to -2
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 0 to -3
        rotation = 2
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -2
        rotation = 0
    }
    track {
        position = 0 to -2
        positions = listOf(0 to 0, 1 to -1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                back()
                wait(1)
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                back()
                grab()
                back()
                wait(1)
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        )
    }
}
