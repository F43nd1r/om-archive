
solution {
    puzzle = "P081"
    name = "B CI NOGIF"
    arm(PISTON) {
        number = 1
        position = 1 to 3
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 4 to 5
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = 4 to 4
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = 6 to 3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 5 to 3
        rotation = -3
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 12 to 0
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = 8 to 2
        rotation = 5
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = 8 to 1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 10 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 4 to 2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to 4
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 9 to 2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 6 to 1
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = 1 to 4
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 11 to 1
        rotation = -2
    }
    io(OUTPUT) {
        index = 1
        position = 3 to 2
        rotation = 4
    }
    track {
        position = 1 to 4
        positions = listOf(0 to -1, 1 to -1)
    }
    track {
        position = 5 to 4
        positions = listOf(0 to 0, -1 to 0, 0 to -1, 1 to -1)
    }
    conduit {
        id = 100
        position = -1 to 5
        rotation = 0
    }
    conduit {
        id = 100
        position = 3 to 1
        rotation = 0
    }
    conduit {
        id = 101
        position = 9 to 1
        rotation = 3
    }
    conduit {
        id = 101
        position = 3 to 4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(6)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(4)
                grab()
                retract()
                reset()
                wait(2)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(3)
                grab()
                retract()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(8)
                grab()
                retract()
                rotateCounterClockwise()
                wait(4)
                rotateClockwise()
                extend()
                reset()
                wait(6)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                grab()
                retract()
                rotateCounterClockwise()
                wait(3)
                rotateClockwise()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(13)
                grab()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
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
                grab()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                retract()
                grab()
                extend()
                rotateClockwise()
                drop()
                grab()
                forward()
                pivotCounterClockwise()
                pivotClockwise()
                back()
                extend()
                reset()
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                retract()
                grab()
                extend()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                retract()
                back()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                retract()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                grab()
                retract()
                back()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                retract()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
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
                grab()
                forward()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                rotateClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                retract()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(8)
                back()
                grab()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                forward()
                reset()
                wait(8)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                back()
                grab()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}
