
solution {
    puzzle = "P035"
    name = "B CA 6T"
    arm(ARM1) {
        number = 1
        position = -1 to -4
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = -1 to 2
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -2 to -3
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -5 to 0
        rotation = 5
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -4 to -2
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -5 to -1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = 1 to -3
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = 3 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 2 to -3
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 10
        position = 2 to -2
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -6 to 4
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -6 to 2
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -10 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -4 to -1
        rotation = 0
    }
    track {
        position = -2 to 2
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -7 to -1
        positions = listOf(2 to 0, 2 to -1, 3 to -1, 4 to -1, 5 to -2, 6 to -3, 7 to -3, 8 to -3, 8 to -2, 8 to -1, 9 to -1, 10 to -2, 10 to -1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(4)
                grab()
                extend()
                extend()
                wait(1)
                rotateCounterClockwise()
                reset()
                wait(6)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                extend()
                extend()
                wait(1)
                forward()
                retract()
                reset()
                wait(5)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(8)
                grab()
                extend()
                extend()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                forward()
                drop()
                wait(1)
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                retract()
                rotateClockwise()
                wait(1)
                back()
                pivotCounterClockwise()
                reset()
                wait(5)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                wait(1)
                forward()
                drop()
                wait(3)
                reset()
                wait(3)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(4)
                grab()
                rotateCounterClockwise()
                back()
                extend()
                pivotClockwise()
                back()
                drop()
                retract()
                forward()
                reset()
                wait(2)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                extend()
                extend()
                reset()
                wait(2)
                grab()
                extend()
                back()
                reset()
                wait(2)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(1)
                grab()
                retract()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                retract()
                back()
                wait(4)
                forward()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                retract()
                back()
                wait(4)
                forward()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                retract()
                back()
                wait(4)
                forward()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                retract()
                back()
                wait(4)
                forward()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                retract()
                back()
                wait(4)
                forward()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                retract()
                back()
                wait(2)
                forward()
            }
        }
        )
    }
}
