
solution {
    puzzle = "P095"
    name = "B CAX 6T"
    arm(ARM1) {
        number = 1
        position = -5 to 5
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -6 to 4
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -2 to 5
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -1 to 4
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -7 to 3
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -6 to 2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -5 to 2
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = -4 to 2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = -3 to 1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = -2 to 1
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -4 to 3
        rotation = 1
    }
    glyph(PROJECTION) {
        position = -3 to 2
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = -4 to 5
        rotation = 5
    }
    glyph(PURIFICATION) {
        position = -1 to 3
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -5 to 3
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 1
    }
    track {
        position = -5 to 3
        positions = listOf(-1 to -1, 0 to -1, -1 to 0, -2 to 0)
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 1, 0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(9) {
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(8)
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                back()
                back()
                wait(5)
                grab()
                back()
                back()
                forward()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                back()
                back()
                wait(5)
                grab()
                back()
                back()
                forward()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                back()
                back()
                wait(5)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                back()
                back()
                drop()
                back()
                back()
                repeat()
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
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(9)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(13)
                grab()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(10)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(16)
                grab()
                back()
                back()
                forward()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                back()
                back()
                wait(5)
                grab()
                back()
                back()
                forward()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                back()
                back()
                wait(5)
                grab()
                back()
                back()
                forward()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                wait(3)
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                back()
                grab()
                back()
                back()
                drop()
                back()
                repeat()
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
                wait(5)
                repeat()
                wait(5)
                back()
                back()
                wait(1)
                back()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                wait(11)
                grab()
                extend()
                extend()
                drop()
                retract()
                retract()
                wait(2)
                grab()
                extend()
                extend()
                drop()
                retract()
                retract()
                wait(2)
                grab()
                extend()
                extend()
                drop()
                retract()
                retract()
                wait(2)
                grab()
                extend()
                extend()
                drop()
                retract()
                retract()
                wait(2)
                grab()
                extend()
                extend()
                reset()
            }
        }
        )
    }
}
