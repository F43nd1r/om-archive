
solution {
    puzzle = "P028"
    name = "W3.5"
    arm(PISTON) {
        number = 1
        position = -3 to 0
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to 2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -1 to 2
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -2 to 2
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -1 to 0
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -7 to -2
        rotation = -6
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -5 to -3
        rotation = -5
        size = 3
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = 9
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = 7
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 8
    }
    glyph(CALCIFICATION) {
        position = -4 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to -3
        rotation = 8
    }
    io(INPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to 2
        rotation = 0
    }
    track {
        position = -5 to -4
        positions = listOf(-1 to -1, -1 to 0, 0 to 0, 0 to 1)
    }
    track {
        position = -2 to 3
        positions = listOf(2 to -1, 2 to -2, 1 to -2, 1 to -1, 0 to 0, 0 to -1, 0 to -2)
    }
    tape {
        parallel(
        {
            sequence(7) {
                wait(9)
                grab()
                pivotCounterClockwise()
                back()
                back()
                back()
                reset()
                wait(5)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(7)
                grab()
                pivotCounterClockwise()
                reset()
                wait(8)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(4)
                repeat()
                wait(3)
                repeat()
                wait(6)
                repeat()
                wait(3)
                repeat()
                wait(6)
                repeat()
                wait(3)
                repeat()
                wait(6)
                repeat()
                wait(3)
                repeat()
                wait(6)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                back()
                reset()
                wait(1)
                grab()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                reset()
                wait(4)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                reset()
                wait(4)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                reset()
                wait(4)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                reset()
                wait(4)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                reset()
                wait(4)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                forward()
                forward()
                drop()
                reset()
                wait(6)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(10)
                grab()
                back()
                reset()
                wait(8)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
            }
        }
        )
    }
}
