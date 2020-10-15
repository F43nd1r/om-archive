
solution {
    puzzle = "P008"
    name = "W2 6T"
    arm(ARM1) {
        number = 1
        position = -5 to -2
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -4 to -1
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -2 to -1
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -2 to 1
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -6 to -3
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 1 to 4
        rotation = -2
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 3
        rotation = -2
    }
    io(INPUT) {
        index = 2
        position = -4 to -3
        rotation = 0
    }
    track {
        position = -2 to -5
        positions = listOf(0 to 6, 0 to 5, 0 to 4, -1 to 4, -1 to 5)
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(34)
                grab()
                retract()
                reset()
                wait(25)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(25)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(10)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                back()
                extend()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                back()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(17)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(5)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(6)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                retract()
                wait(1)
                extend()
                reset()
                wait(23)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(4)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
                wait(27)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                rotateClockwise()
                forward()
                extend()
                drop()
                retract()
                back()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        )
    }
}
