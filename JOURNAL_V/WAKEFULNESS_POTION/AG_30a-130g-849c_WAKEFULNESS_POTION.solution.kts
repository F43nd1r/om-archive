
solution {
    puzzle = "P088"
    name = "B AG 2T"
    arm(PISTON) {
        number = 1
        position = -5 to 1
        rotation = 5
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -3 to 4
        rotation = -2
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -5 to 3
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -1 to 3
        rotation = 10
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to -1
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to 3
        rotation = 12
    }
    track {
        position = -4 to 0
        positions = listOf(-1 to 1, -1 to 2)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(4)
                grab()
                rotateCounterClockwise()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                retract()
                drop()
                rotateClockwise()
                extend()
                extend()
                wait(1)
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                wait(19)
                grab()
                pivotClockwise()
                drop()
                grab()
                pivotClockwise()
                drop()
                wait(1)
                grab()
                pivotClockwise()
                drop()
                wait(1)
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                wait(1)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                wait(3)
                rotateClockwise()
                extend()
                drop()
                extend()
                wait(2)
                grab()
                retract()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                drop()
                wait(3)
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                extend()
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                wait(4)
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extend()
                wait(10)
                grab()
                retract()
                extend()
                drop()
                retract()
                retract()
                grab()
                extend()
                extend()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                extend()
                extend()
                grab()
                retract()
                rotateClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                wait(6)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                wait(8)
                grab()
                pivotClockwise()
                drop()
                wait(1)
                grab()
                pivotClockwise()
                drop()
                wait(1)
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                extend()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                pivotClockwise()
                rotateClockwise()
                wait(6)
                extend()
                pivotClockwise()
                drop()
                retract()
                retract()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                wait(6)
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotClockwise()
                extend()
                wait(12)
                retract()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                retract()
                forward()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                drop()
                wait(5)
                grab()
                back()
                extend()
                drop()
                retract()
                forward()
                grab()
                retract()
                wait(4)
                pivotCounterClockwise()
                back()
                extend()
                drop()
                forward()
                grab()
                retract()
                wait(1)
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                extend()
                extend()
                forward()
                rotateClockwise()
                drop()
                back()
                grab()
                retract()
                forward()
                drop()
                extend()
                grab()
                back()
                retract()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                extend()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                back()
                grab()
                extend()
                extend()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                back()
                drop()
                retract()
                forward()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                retract()
                pivotCounterClockwise()
                back()
                extend()
                drop()
                forward()
                grab()
                retract()
                wait(8)
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                extend()
                extend()
                drop()
                retract()
                forward()
                grab()
                pivotClockwise()
                extend()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                retract()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                retract()
                forward()
                rotateCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                extend()
                extend()
                rotateClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                wait(3)
                grab()
                back()
                extend()
                wait(6)
                retract()
                pivotClockwise()
                forward()
                retract()
                drop()
                back()
                extend()
                extend()
                grab()
                retract()
                wait(1)
                forward()
                extend()
                drop()
                back()
                rotateClockwise()
                grab()
                retract()
                forward()
                drop()
                extend()
                grab()
                back()
                retract()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                extend()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                back()
                grab()
                extend()
                extend()
                drop()
                retract()
                grab()
                retract()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                back()
                grab()
                extend()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                extend()
                retract()
                drop()
                forward()
                grab()
                pivotClockwise()
                pivotClockwise()
                extend()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                retract()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
