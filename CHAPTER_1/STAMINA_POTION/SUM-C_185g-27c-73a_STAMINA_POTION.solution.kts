
solution {
    puzzle = "P015"
    name = "B CG 2T"
    arm(ARM1) {
        number = 1
        position = -6 to 2
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -5 to 1
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -3 to 5
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -5 to 3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -4 to 0
        rotation = 5
        size = 3
    }
    arm(ARM3) {
        number = 6
        position = 1 to -3
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -3 to 3
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -3
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -3 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -5 to 5
        rotation = 0
    }
    track {
        position = -6 to 2
        positions = listOf(0 to 0, 1 to -1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(4) {
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
            sequence(1) {
                grab()
                back()
                rotateClockwise()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                back()
                grab()
                back()
                rotateClockwise()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        )
    }
}
