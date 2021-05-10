
solution {
    puzzle = "P020"
    name = "NEW SOLUTION 7"
    arm(ARM1) {
        number = 1
        position = -11 to -4
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -10 to -3
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -12 to -4
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -11 to -6
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -10 to -7
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -11 to -5
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -10 to -4
        rotation = -1
    }
    io(INFINITE) {
        index = 0
        position = -8 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -11 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -12 to -5
        rotation = 0
    }
    track {
        position = -9 to -7
        positions = listOf(2 to 0, 1 to 0, 0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(4)
                repeat()
                wait(3)
                repeat()
                wait(4)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateClockwise()
                back()
                forward()
                back()
                back()
                forward()
                back()
                back()
                drop()
                forward()
                forward()
                grab()
                back()
                wait(2)
                back()
                drop()
                forward()
                forward()
                grab()
                back()
                wait(2)
                back()
                drop()
                forward()
                forward()
                grab()
                back()
                wait(2)
                back()
                drop()
                forward()
                forward()
                grab()
                back()
                wait(2)
                back()
                drop()
                forward()
                forward()
                grab()
                back()
                wait(2)
                back()
                drop()
                forward()
                forward()
                grab()
                back()
                wait(2)
                back()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(6)
                repeat()
            }
        }
        )
    }
}
