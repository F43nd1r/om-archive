
solution {
    puzzle = "P042"
    name = "B CA"
    arm(PISTON) {
        number = 1
        position = 1 to -4
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to -3
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 3 to -4
        rotation = 7
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 3 to -2
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = 2 to 0
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 4 to -3
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = 2 to -4
        rotation = 0
    }
    track {
        position = -2 to -3
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 3 to -1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                extend()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                reset()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                pivotClockwise()
                retract()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                back()
                rotateCounterClockwise()
                extend()
                extend()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                wait(3)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(3)
                back()
                wait(1)
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                forward()
                wait(3)
                grab()
                retract()
                back()
                pivotCounterClockwise()
                forward()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(14)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                wait(2)
                back()
                pivotCounterClockwise()
                drop()
                forward()
                wait(1)
                grab()
                back()
                pivotCounterClockwise()
                drop()
                wait(7)
                grab()
                forward()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
