
solution {
    puzzle = "P026"
    name = "H2 6T"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to -1
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = -5 to 0
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -6 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -15 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -14 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -13 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -14 to 0
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -12 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -11 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -13 to 0
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -4 to 0
        rotation = 4
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -8 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -12 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to 0
        rotation = 0
    }
    track {
        position = -14 to -1
        positions = listOf(0 to 0, 1 to 0, 0 to 1, -1 to 1, -2 to 1, -1 to 0)
    }
    track {
        position = -7 to -1
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 2 to 1)
    }
    track {
        position = -1 to 0
        positions = listOf(-1 to 0, 0 to 0, 1 to -1, 0 to -1, -1 to -1)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(4)
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                grab()
                back()
                wait(1)
                back()
                wait(1)
                back()
                drop()
                back()
                wait(7)
                back()
                grab()
                forward()
                drop()
                back()
                wait(1)
                reset()
                repeat()
                wait(27)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(10)
                grab()
                pivotCounterClockwise()
                drop()
                wait(2)
                back()
                wait(1)
                back()
                wait(2)
                back()
                grab()
                forward()
                drop()
                wait(1)
                back()
                wait(1)
                grab()
                back()
                back()
                pivotClockwise()
                reset()
                wait(6)
                repeat()
                wait(27)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(11)
                back()
                grab()
                forward()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                grab()
                back()
                wait(1)
                back()
                wait(1)
                back()
                reset()
                wait(8)
                repeat()
                wait(27)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                back()
                grab()
                forward()
                drop()
                wait(1)
                back()
                wait(1)
                grab()
                back()
                back()
                pivotClockwise()
                drop()
                back()
                wait(5)
                grab()
                pivotCounterClockwise()
                drop()
                wait(2)
                back()
                wait(1)
                reset()
                wait(2)
                repeat()
                wait(27)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                extend()
                extend()
                pivotClockwise()
                drop()
                wait(5)
                grab()
                forward()
                retract()
                drop()
                grab()
                back()
                extend()
                pivotClockwise()
                drop()
                wait(5)
                grab()
                forward()
                retract()
                drop()
                grab()
                back()
                extend()
                pivotClockwise()
                drop()
                wait(5)
                grab()
                forward()
                retract()
                drop()
                grab()
                back()
                extend()
                pivotClockwise()
                drop()
                wait(5)
                grab()
                forward()
                retract()
                drop()
                grab()
                back()
                extend()
                pivotClockwise()
                drop()
                wait(5)
                grab()
                forward()
                retract()
                drop()
                grab()
                back()
                extend()
                pivotClockwise()
                drop()
                wait(5)
                grab()
                retract()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(9)
                grab()
                forward()
                forward()
                reset()
                wait(10)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                reset()
                wait(6)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(12)
                grab()
                rotateClockwise()
                extend()
                extend()
                back()
                wait(1)
                retract()
                extend()
                drop()
                forward()
                retract()
                retract()
                rotateCounterClockwise()
                wait(1)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        )
    }
}
