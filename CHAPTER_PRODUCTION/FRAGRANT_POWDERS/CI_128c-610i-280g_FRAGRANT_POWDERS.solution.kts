
solution {
    puzzle = "P075"
    name = "CC"
    arm(PISTON) {
        number = 1
        position = -2 to 3
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -3 to 5
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = 6 to 3
        rotation = -4
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 5 to 5
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = 5 to 6
        rotation = 6
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 9 to 4
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 6 to 4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to 3
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 7 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 8 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 4
        rotation = 1
    }
    io(OUTPUT) {
        index = 1
        position = 8 to 4
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = 6 to 6
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 7 to 5
        rotation = -2
    }
    conduit {
        id = 100
        position = -2 to 4
        rotation = 0
    }
    conduit {
        id = 100
        position = 5 to 4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(6)
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
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
                wait(5)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(8)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                retract()
                reset()
                wait(4)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                reset()
                wait(3)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                reset()
                wait(3)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                reset()
                wait(3)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                reset()
                wait(3)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                rotateClockwise()
                extend()
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
                wait(7)
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(6)
                grab()
                rotateClockwise()
                extend()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                drop()
                retract()
                grab()
                extend()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                drop()
                retract()
                grab()
                extend()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                drop()
                retract()
                grab()
                extend()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                drop()
                retract()
                grab()
                extend()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                drop()
                retract()
                grab()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
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
                wait(5)
                repeat()
                wait(3)
                grab()
                rotateCounterClockwise()
                extend()
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
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(5)
                repeat()
                wait(5)
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
                wait(5)
                grab()
                rotateCounterClockwise()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                grab()
                rotateClockwise()
                extend()
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
                wait(9)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                extend()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                extend()
                wait(4)
                grab()
                retract()
                drop()
                extend()
                wait(4)
                grab()
                retract()
                drop()
                extend()
                wait(4)
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                retract()
                rotateCounterClockwise()
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
                wait(6)
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
                wait(6)
                repeat()
                wait(6)
                repeat()
                wait(9)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                retract()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                retract()
                rotateClockwise()
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
                wait(5)
                repeat()
                wait(6)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(6)
                repeat()
                wait(5)
                repeat()
                wait(9)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                retract()
                rotateClockwise()
                drop()
                wait(10)
                extendTape()
            }
        }
        )
    }
}
