
solution {
    puzzle = "P060"
    name = "B CAX 6T"
    arm(PISTON) {
        number = 1
        position = 1 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 5 to -6
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 4 to -5
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 0 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 7 to -3
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 6 to 1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 6 to 0
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 4 to 3
        rotation = -2
        size = 2
    }
    arm(ARM3) {
        number = 9
        position = -1 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 2 to -1
        rotation = 1
        size = 2
    }
    arm(ARM2) {
        number = 11
        position = -2 to -1
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to -5
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to -5
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -5 to 0
        rotation = 2
    }
    glyph(MULTI_BONDER) {
        position = 2 to 3
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 6 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -3
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -2 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to -3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to -4
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -3 to -2
        rotation = 15
    }
    glyph(DUPLICATION) {
        position = -3 to 2
        rotation = 14
    }
    glyph(DUPLICATION) {
        position = 3 to 1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 5 to -1
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 3 to -1
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = -5 to 2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 5 to -3
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 4 to 1
        rotation = 0
    }
    track {
        position = -3 to -2
        positions = listOf(2 to 1, 3 to 0, 4 to 0, 4 to 1, 4 to 2, 4 to 3)
    }
    track {
        position = 6 to 0
        positions = listOf(0 to 1, 0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
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
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(7)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(6)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                rotateClockwise()
                drop()
                back()
                wait(1)
                back()
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                back()
                grab()
                rotateCounterClockwise()
                back()
                rotateClockwise()
                drop()
                back()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                retract()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                retract()
                rotateClockwise()
                back()
                rotateClockwise()
                forward()
                drop()
                forward()
                back()
                extend()
                extend()
                forward()
                back()
                forward()
                reset()
                wait(1)
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                forward()
                back()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(9)
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
            }
        }
        )
    }
}
