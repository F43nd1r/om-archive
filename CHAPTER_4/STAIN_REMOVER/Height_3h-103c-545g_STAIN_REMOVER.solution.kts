
solution {
    puzzle = "P034"
    name = "H3 6T"
    arm(ARM1) {
        number = 1
        position = -14 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -15 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -11 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -13 to 0
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = -8 to -1
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -7 to 0
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = -9 to 1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 8
        position = -1 to 0
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 9
        position = 0 to 1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = 3 to -1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 4 to -1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 2 to 0
        rotation = 3
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = -6 to 0
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -7 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -1
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -10 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -8 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -11 to -1
        rotation = 0
    }
    track {
        position = 0 to 1
        positions = listOf(0 to 0, -1 to 0, -1 to -1)
    }
    track {
        position = 3 to 0
        positions = listOf(0 to 0, 1 to -1, 0 to -1, -1 to -1, -2 to 0, -1 to 0)
    }
    track {
        position = -9 to 0
        positions = listOf(1 to 1, 0 to 1, 0 to 0, -1 to 1, -2 to 1, -2 to 0, -3 to 0, -4 to 0, -3 to -1, -4 to -1, -5 to -1, -6 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                wait(1)
                back()
                reset()
                wait(10)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                back()
                grab()
                back()
                reset()
                wait(11)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                back()
                back()
                reset()
                wait(2)
                grab()
                back()
                back()
                wait(1)
                back()
                reset()
                wait(3)
                grab()
                back()
                back()
                reset()
                wait(2)
                grab()
                back()
                back()
                wait(2)
                back()
                reset()
                wait(3)
                grab()
                back()
                back()
                reset()
                wait(2)
                grab()
                back()
                back()
                wait(2)
                back()
                reset()
                wait(3)
                grab()
                back()
                back()
                reset()
                wait(2)
                grab()
                back()
                back()
                wait(2)
                back()
                reset()
                wait(3)
                grab()
                back()
                back()
                reset()
                wait(2)
                grab()
                back()
                back()
                wait(2)
                back()
                reset()
                wait(3)
                grab()
                back()
                back()
                reset()
                wait(2)
                grab()
                back()
                back()
                wait(1)
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                extend()
                pivotClockwise()
                reset()
                wait(3)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(9)
                grab()
                retract()
                drop()
                extend()
                grab()
                back()
                reset()
                wait(2)
                grab()
                retract()
                retract()
                extend()
                extend()
                reset()
                wait(1)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(14)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                wait(5)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                extend()
                drop()
                wait(5)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                extend()
                drop()
                wait(5)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                extend()
                drop()
                wait(5)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                extend()
                drop()
                wait(5)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                extend()
                drop()
                wait(4)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(11)
                back()
                grab()
                retract()
                retract()
                forward()
                extend()
                extend()
                reset()
                wait(8)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(14)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                grab()
                rotateClockwise()
                forward()
                pivotClockwise()
                extend()
                extend()
                drop()
                back()
                wait(3)
                grab()
                retract()
                retract()
                reset()
                wait(1)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                grab()
                rotateClockwise()
                forward()
                pivotClockwise()
                extend()
                extend()
                drop()
                back()
                wait(2)
                grab()
                retract()
                retract()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                forward()
                pivotClockwise()
                extend()
                extend()
                drop()
                back()
                wait(4)
                grab()
                retract()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(1)
                grab()
                back()
                drop()
                forward()
                wait(1)
                grab()
                back()
                drop()
                forward()
                wait(1)
                grab()
                forward()
                forward()
                wait(3)
                pivotCounterClockwise()
                back()
                drop()
                forward()
                forward()
                forward()
                wait(3)
                forward()
                wait(2)
                forward()
                wait(2)
                grab()
                back()
                drop()
                forward()
                grab()
                forward()
                forward()
                forward()
                drop()
                wait(1)
                forward()
                wait(2)
                forward()
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                wait(2)
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                forward()
                forward()
                wait(3)
                pivotCounterClockwise()
                back()
                drop()
                forward()
                forward()
                forward()
                wait(3)
                forward()
                wait(2)
                forward()
                wait(2)
                grab()
                back()
                drop()
                forward()
                grab()
                forward()
                forward()
                forward()
                drop()
                wait(1)
                forward()
                wait(1)
                forward()
                grab()
                back()
                back()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(9)
                forward()
                wait(3)
                forward()
                wait(2)
                grab()
                back()
                drop()
                forward()
                grab()
                forward()
                forward()
                forward()
                drop()
                wait(1)
                forward()
                wait(2)
                forward()
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                wait(2)
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                forward()
                forward()
                wait(3)
                pivotCounterClockwise()
                back()
                drop()
                forward()
                forward()
                forward()
                wait(3)
                forward()
                wait(2)
                forward()
                wait(2)
                grab()
                back()
                drop()
                forward()
                grab()
                forward()
                forward()
                forward()
                drop()
                wait(1)
                forward()
                wait(2)
                forward()
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                wait(2)
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                forward()
                forward()
                wait(2)
                pivotCounterClockwise()
                back()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(2)
                back()
                grab()
                forward()
                forward()
                forward()
                drop()
                wait(1)
                forward()
                wait(3)
                forward()
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                wait(2)
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                forward()
                forward()
                wait(3)
                pivotCounterClockwise()
                back()
                drop()
                forward()
                forward()
                forward()
                wait(3)
                forward()
                wait(2)
                forward()
                wait(2)
                grab()
                back()
                drop()
                forward()
                grab()
                forward()
                forward()
                forward()
                drop()
                wait(1)
                forward()
                wait(2)
                forward()
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                wait(2)
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                forward()
                forward()
                wait(3)
                pivotCounterClockwise()
                back()
                drop()
                forward()
                forward()
                forward()
                wait(3)
                forward()
                wait(1)
                forward()
                wait(6)
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                back()
                back()
                back()
                wait(1)
                back()
                reset()
                wait(8)
                grab()
                back()
                back()
                back()
                wait(2)
                back()
                reset()
                wait(8)
                grab()
                back()
                back()
                back()
                wait(2)
                back()
                reset()
                wait(8)
                grab()
                back()
                back()
                back()
                wait(2)
                back()
                reset()
                wait(8)
                grab()
                back()
                back()
                back()
                wait(2)
                back()
                reset()
                wait(8)
                grab()
                back()
                back()
                back()
                wait(1)
                back()
                reset()
            }
        }
        )
    }
}
